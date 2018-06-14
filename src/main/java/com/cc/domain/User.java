/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: User
 * Author:   zt
 * Date:     2018/6/14 0:00
 * Description: 用户实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cc.domain;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户实体类〉
 *
 * @author 朱端成
 * @create 2018/6/14
 * @since 1.0.0
 */
public class User {
    private String id ;
    private String last_login_time ;
    private String last_login_ip ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }
}
