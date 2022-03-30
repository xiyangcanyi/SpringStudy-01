package com.zyp.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        System.out.println("帮房东租房子");
        host.rent();
        fee();
        seeHouse();
    }
    //看房
    public void seeHouse(){
        System.out.println("中介带你去看房");
    }
    //收中介费
    public void fee(){
        System.out.println("收中介费哦");
    }
    //签合同
    public void contract(){
        System.out.println("签租赁合同");
    }
}
