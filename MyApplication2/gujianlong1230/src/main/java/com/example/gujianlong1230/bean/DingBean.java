package com.example.gujianlong1230.bean;
/*
 *@auther:谷建龙
 *@Date: 2020/1/9
 *@Time:8:50
 *@Description:
 * */


import java.util.List;

public class DingBean {
    /**
     * result : [{"address":"北京 海淀区 八维","createTime":1576341817000,"id":37202,"phone":"15751701319","realName":"白烺","userId":11357,"whetherDefault":1,"zipCode":"101010"},{"address":"北京海淀区八维","createTime":1578517562000,"id":38212,"phone":"15751701319","realName":"谷建龙","userId":11357,"whetherDefault":2,"zipCode":"101010"},{"address":"北京海淀区八维","createTime":1578517775000,"id":38214,"phone":"15751701313","realName":"王彦敏","userId":11357,"whetherDefault":2,"zipCode":"101010"}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * address : 北京 海淀区 八维
         * createTime : 1576341817000
         * id : 37202
         * phone : 15751701319
         * realName : 白烺
         * userId : 11357
         * whetherDefault : 1
         * zipCode : 101010
         */

        private String address;
        private long createTime;
        private int id;
        private String phone;
        private String realName;
        private int userId;
        private int whetherDefault;
        private String zipCode;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getWhetherDefault() {
            return whetherDefault;
        }

        public void setWhetherDefault(int whetherDefault) {
            this.whetherDefault = whetherDefault;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
    }
}
