package principle.singleresponsibility;

/**
 * @PROJECT_NAME: DesignPattern
 * @PACKAGE_NAME: principle.singleresponsibility
 * @FILE_NAME: SingleResponsibility2
 * @Author: Jayfei-Wu
 * @create: 2023-01-29 3:03
 * @DESCRIPTION: TODO
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");

    }

}

/**
 * 交通工具类
 * 方式2
 * 1.首先遵守了单一职责原则
 * 2.但是这样做的改动很大，将类分解，同时修改客户端
 * 3.改进：直接修改Vehicle类，改动的代码会比较少
 */

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}
