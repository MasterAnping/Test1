package cn.zap.test;

import java.util.HashMap;

import cma.cimiss.RetArray2D;
import cma.cimiss.client.DataQueryClient;
import cma.cimiss.demo.util.ClibUtil;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main(String[] args) {
		
		/* 1. 定义client对象 */
		DataQueryClient client = new DataQueryClient() ;
		
		/* 2. 调用方法的参数定义，并赋值 */
		/* 2.1 用户名&密码 */
		String userId = "BENC_QXT_zdz" ;
		String pwd = "forefore" ;
		/* 2.2  接口ID */
		//String interfaceId = "getSurfEleByTimeRangeAndStaID" ;	
		String interfaceId = "getSurfEleByTimeAndStaID" ;	
		/* 2.3  接口参数，多个参数间无顺序 */
		HashMap<String, String> params = new HashMap<String, String>();
		//必选参数
		params.put("dataCode", "SURF_CHN_MAIN_MIN") ; //资料代码
		params.put("elements", "Station_Name,Year,Mon,Day,Hour,MIN,tem,Station_ID_C") ;//检索要素：站号、站名、小时降水、气压、相对湿度、能见度、2分钟平均风速、2分钟风向
		//params.put("timeRange", "(20190508080000,20190508090000)") ; //检索时间
		params.put("times", "20190510011000") ; //检索时间

		params.put("staIds", "J2229");
		//可选参数
		//params.put("orderby", "Station_ID_C:ASC") ; //排序：按照站号从小到大
		//params.put("limitCnt", "10") ; //返回最多记录数：10
		/* 2.4 返回对象 */
		RetArray2D retArray2D = new RetArray2D() ;
		
		/* 3. 调用接口 */
		try {
			//初始化接口服务连接资源
			client.initResources() ;
			//调用接口
			int rst = client.callAPI_to_array2D(userId, pwd, interfaceId, params, retArray2D) ;
			//输出结果
			if(rst == 0) { //正常返回
			  ClibUtil clibUtil = new ClibUtil() ;
			  clibUtil.outputRst( retArray2D ) ;
			} else { //异常返回
				System.out.println( "[error] StaElemSearchAPI_CLIB_callAPI_to_array2D." ) ;				
				System.out.printf( "\treturn code: %d. \n", rst ) ;
				System.out.printf( "\terror message: %s.\n", retArray2D.request.errorMessage ) ;
			}
		} catch (Exception e) {
			//异常输出
			e.printStackTrace() ;
		} finally {
			//释放接口服务连接资源
			client.destroyResources() ;
		}
	}
		
}
