package cn.zap.test;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import cma.cimiss.RetArray2D;
import cma.cimiss.client.DataQueryClient;
import cma.cimiss.demo.util.ClibUtil;

public class AppTest1 {

	private DataQueryClient client;

	/* 2. 调用方法的参数定义，并赋值 */
	/* 2.1 用户名&密码 */
	private String userId;
	private String pwd;
	private String interfaceId;
	private HashMap<String, String> params = new HashMap<String, String>();
	private RetArray2D retArray2D = new RetArray2D();
	
	String dataFormat = "json" ;
    StringBuffer retStr = new StringBuffer() ;

	@Before
	public void init() {
		client = new DataQueryClient();
		userId = "BENC_QXT_zdz";
		pwd = "forefore";
	}

	// 获取国家站小时资料
	@Test
	public void test1() {
		interfaceId = "getSurfEleByTimeAndStaID";
		params.put("dataCode", "SURF_CHN_MUL_HOR_N"); // 资料代码
		params.put("elements", "Station_Name，Station_ID_C,Year,Mon,Day,Hour,tem");// 检索要素：站号、站名、小时降水、气压、相对湿度、能见度、2分钟平均风速、2分钟风向
		params.put("times", "20190510010000"); // 检索时间
		params.put("staIds", "58629");
		// 可选参数
		// params.put("orderby", "Station_ID_C:ASC") ; //排序：按照站号从小到大
		// params.put("limitCnt", "10") ; //返回最多记录数：10

		try {
			// 初始化接口服务连接资源
			client.initResources();
			// 调用接口
			int rst = client.callAPI_to_serializedStr(userId, pwd, interfaceId, params,  dataFormat, retStr);
			// 输出结果
			if (rst == 0) { // 正常返回
				System.out.println(retStr.toString());
			} else { // 异常返回
				System.out.println("[error] StaElemSearchAPI_CLIB_callAPI_to_array2D.");
				System.out.printf("\treturn code: %d. \n", rst);
				System.out.printf("\terror message: %s.\n", retArray2D.request.errorMessage);
			}
		} catch (Exception e) {
			// 异常输出
			e.printStackTrace();
		} finally {
			// 释放接口服务连接资源
			client.destroyResources();
		}
	}

	// 获取区域站小时资料
	@Test
	public void test2() {
		interfaceId = "getSurfEleByTimeAndStaID";
		params.put("dataCode", "SURF_CHN_MAIN_MIN"); // 资料代码
		params.put("elements", "Station_Name,Station_ID_C,Year,Mon,Day,Hour,MIN,tem");// 检索要素：站号、站名、小时降水、气压、相对湿度、能见度、2分钟平均风速、2分钟风向
		params.put("times", "20190510010000"); // 检索时间
		params.put("staIds", "J2229");
		
		// 可选参数
		// params.put("orderby", "Station_ID_C:ASC") ; //排序：按照站号从小到大
		// params.put("limitCnt", "10") ; //返回最多记录数：10

		try {
			// 初始化接口服务连接资源
			client.initResources();
			// 调用接口
			int rst = client.callAPI_to_array2D(userId, pwd, interfaceId, params, retArray2D);
			// 输出结果
			if (rst == 0) { // 正常返回
				ClibUtil clibUtil = new ClibUtil();
				clibUtil.outputRst(retArray2D);
			} else { // 异常返回
				System.out.println("[error] StaElemSearchAPI_CLIB_callAPI_to_array2D.");
				System.out.printf("\treturn code: %d. \n", rst);
				System.out.printf("\terror message: %s.\n", retArray2D.request.errorMessage);
			}
		} catch (Exception e) {
			// 异常输出
			e.printStackTrace();
		} finally {
			// 释放接口服务连接资源
			client.destroyResources();
		}
	}

	//国家站和区域站分钟雨量1111111
	@Test
	public void townrain() {
		interfaceId = "getSurfEleByTimeAndStaID";
		params.put("dataCode", "SURF_CHN_PRE_MIN"); // 资料代码
		params.put("elements", "Station_Name,Station_ID_C,Year,Mon,Day,Hour,MIN,PRE");// 检索要素：站号、站名、小时降水、气压、相对湿度、能见度、2分钟平均风速、2分钟风向
		params.put("times", "20190510011000"); // 检索时间
		params.put("staIds", "J2229");
		// 可选参数
		// params.put("orderby", "Station_ID_C:ASC") ; //排序：按照站号从小到大
		// params.put("limitCnt", "10") ; //返回最多记录数：10

		try {
			// 初始化接口服务连接资源
			client.initResources();
			// 调用接口
			int rst = client.callAPI_to_serializedStr(userId, pwd, interfaceId, params, dataFormat, retStr);
			// 输出结果
			if (rst == 0) { // 正常返回
				System.out.println(retStr.toString());
			} else { // 异常返回
				System.out.println("[error] StaElemSearchAPI_CLIB_callAPI_to_array2D.");
				System.out.printf("\treturn code: %d. \n", rst);
				System.out.printf("\terror message: %s.\n", retArray2D.request.errorMessage);
			}
		} catch (Exception e) {
			// 异常输出
			e.printStackTrace();
		} finally {
			// 释放接口服务连接资源
			client.destroyResources();
		}
	}
}
