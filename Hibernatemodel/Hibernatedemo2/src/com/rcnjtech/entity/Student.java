package com.rcnjtech.entity;

import java.util.Date;

/**
 * @author Lu Yuesheng
 * @data 2019/11/13 0013上午 0:10
 **/
//
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                            O\ = /O
//                        ____/`---'\____
//                      .   ' \\| |// `.
//                       / \\||| 1 |||// \
//                     / _||||| -9- |||||- \
//                       | | \\\ 9 /// | |
//                     | \_| ''\-7-/'' | |
//                      \ .-\__ `0` ___/-. /
//                   ___`. .' /--9--\ `. . __
//                ."" '< `.___\_<2>_/___.' >'"".
//               | | : `- \`.;`\ 2 /`;.`/ - ` : | |
//                 \ \ `-. \_ __\ /__ _/ .-` / /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//
//         .............................................
//                  佛祖保佑                  永无BUG
//          佛曰:
//                  写字楼里写字间，写字间里程序员；
//                  程序人员写程序，又拿程序换酒钱。
//                  酒醒只在网上坐，酒醉还来网下眠；
//                  酒醉酒醒日复日，网上网下年复年。
//                  但愿老死电脑间，不愿鞠躬老板前；
//                  奔驰宝马贵者趣，公交自行程序员。
//                  别人笑我忒疯癫，我笑自己命太贱；
//                  不见满街漂亮妹，哪个归得程序员？

public class Student {
    /*
     * 学生的属性，应为私有属性，学生实体类的主键为ID
     * */
    private int ID;
    private  String NAME;
    private  String SEX;
    private Date birthday;
    public Student(){

    }
    public  Student(int ID,String NAME,String SEX,Date birthday){
        this.ID=ID;
        this.NAME=NAME;
        this.SEX=SEX;
        this.birthday=birthday;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString(){
        return "Student{"+"id="+ID+"    name="+NAME+"   sex="+SEX+"     birthday="+birthday+"}";
    }


}
