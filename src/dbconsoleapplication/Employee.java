package dbconsoleapplication;

import java.time.LocalDate;

/**
 *
 * @author Al-Amin Islam <alaminislam3555@gmail.com>
 */
public class Employee {
    private String sin;
    private String name;
    private String phone;
    private LocalDate hiringDate;

    public Employee(String sin, String name, String phone, LocalDate hiringDate) {
        this.sin = sin;
        this.name = name;
        this.phone = phone;
        this.hiringDate = hiringDate;
    }
    @Override
    public String toString(){
        
        return String.format("%s,%s,%s,%s", sin,name,phone,hiringDate);
    }
    
}
