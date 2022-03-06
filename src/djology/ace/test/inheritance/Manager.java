package inheritance;

/**
 * @Desc:
 * @Author: djology.w
 * @Date: 2022/3/7 0:37
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary(){ return super.getSalary() + bonus; } // 使用super关键字覆盖方法

    public void setBonus(double bonus) { this.bonus = bonus; }

}
