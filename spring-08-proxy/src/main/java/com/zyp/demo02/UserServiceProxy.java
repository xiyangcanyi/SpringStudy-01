package com.zyp.demo02;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;
    public UserServiceProxy(){

    }
    public void setUserServiceProxy(UserServiceImpl userService){
         this.userService=userService;
    }
    @Override
    public void add() {
        userService.add();
        log("add");

    }

    @Override
    public void delete() {
        userService.delete();
        log("delete");
    }

    @Override
    public void update() {
        userService.update();
        log("update");
    }

    @Override
    public void query() {
        userService.query();
        log("query");
    }
    //日志方法
    public void  log(String msg){
        System.out.println("[Debug]使用了"+msg+"方法");
    }
}
