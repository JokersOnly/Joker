package com.apple.springboot.index.entity;

import java.util.Date;

public class TestTable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_table.id_test_table
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    private Integer idTestTable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_table.user_name
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_table.create_date
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_table.id_test_table
     *
     * @return the value of test_table.id_test_table
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    public Integer getIdTestTable() {
        return idTestTable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_table.id_test_table
     *
     * @param idTestTable the value for test_table.id_test_table
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    public void setIdTestTable(Integer idTestTable) {
        this.idTestTable = idTestTable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_table.user_name
     *
     * @return the value of test_table.user_name
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_table.user_name
     *
     * @param userName the value for test_table.user_name
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_table.create_date
     *
     * @return the value of test_table.create_date
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_table.create_date
     *
     * @param createDate the value for test_table.create_date
     *
     * @mbg.generated Sat Mar 02 12:31:52 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}