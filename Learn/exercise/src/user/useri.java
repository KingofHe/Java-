package user;

public class useri {
    private String name;
    private String id;
    private String password;

    public useri() {
    }

    public useri(String name, String password, String id) {
        this.name = name;
        this.password = password;
        this.id = id;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "useri{name = " + name + ", password = " + password + ", id = " + id + "}";
    }
}
