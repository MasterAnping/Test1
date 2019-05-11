package com.zap.entity;

public class Permission {
    private Integer permissionid;

    private String permissionname;

    private String permissiondesc;

    private Integer parentpermissionid;

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public String getPermissiondesc() {
        return permissiondesc;
    }

    public void setPermissiondesc(String permissiondesc) {
        this.permissiondesc = permissiondesc;
    }

    public Integer getParentpermissionid() {
        return parentpermissionid;
    }

    public void setParentpermissionid(Integer parentpermissionid) {
        this.parentpermissionid = parentpermissionid;
    }
}