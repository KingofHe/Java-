package Set集合系列.TreeSet.综合练习;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double Talgrate;
    private double Chinese;
    private double Math;
    private double English;

    public Student() {
    }

    public Student(String name, int age, double Talgrate, double Chinese, double Math, double English) {
        this.name = name;
        this.age = age;
        this.Talgrate = Talgrate;
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Talgrate
     */
    public double getTalgrate() {
        return Talgrate;
    }

    /**
     * 设置
     * @param Talgrate
     */
    public void setTalgrate(double Talgrate) {
        this.Talgrate = Talgrate;
    }

    /**
     * 获取
     * @return Chinese
     */
    public double getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(double Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return Math
     */
    public double getMath() {
        return Math;
    }

    /**
     * 设置
     * @param Math
     */
    public void setMath(double Math) {
        this.Math = Math;
    }

    /**
     * 获取
     * @return English
     */
    public double getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(double English) {
        this.English = English;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", Talgrate = " + Talgrate + ", Chinese = " + Chinese + ", Math = " + Math + ", English = " + English + "}";
    }

    @Override
    public int compareTo(Student o) {
        double i=o.getTalgrate()-this.getTalgrate();
        if(i!=0)
            return (int)i;
        else{
            i=o.getChinese()-this.getChinese();
            if (i!=0)
                return (int)i;
            else{
                i=o.getMath()-this.getMath();
                if(i!=0)
                    return (int)i;
                else{
                    i=o.getEnglish()-this.getEnglish();
                    if(i!=0)
                        return (int)i;
                    else{
                        i=o.getAge()-this.getAge();
                        i=i==0?i:o.getName().compareTo(this.getName());
                        return (int)i;
                    }
                }
            }
        }

    }
}
