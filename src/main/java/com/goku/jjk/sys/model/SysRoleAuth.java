package com.goku.jjk.sys.model;

public class SysRoleAuth {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_auth.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_auth.role_id
     *
     * @mbg.generated
     */
    private String roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_auth.menu_id
     *
     * @mbg.generated
     */
    private String menuId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_auth.id
     *
     * @return the value of sys_role_auth.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_auth.id
     *
     * @param id the value for sys_role_auth.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_auth.role_id
     *
     * @return the value of sys_role_auth.role_id
     *
     * @mbg.generated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_auth.role_id
     *
     * @param roleId the value for sys_role_auth.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_auth.menu_id
     *
     * @return the value of sys_role_auth.menu_id
     *
     * @mbg.generated
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_auth.menu_id
     *
     * @param menuId the value for sys_role_auth.menu_id
     *
     * @mbg.generated
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }
}