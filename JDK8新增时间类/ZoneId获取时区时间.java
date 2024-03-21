package JDK8新增时间类;

import java.time.ZoneId;
import java.util.Set;

public class ZoneId获取时区时间 {
    public static void main(String[] args) {
        //一.ZoneID
        //方法1：static Set<String> getAvailableZoneIds();
        //获取全部的时区名，jdk中一共有600个时区
        Set<String> zoneids= ZoneId.getAvailableZoneIds();
        System.out.println(zoneids.size());
        System.out.println(zoneids);

        //方法2:static ZoneID systemDefault();            获取系统默认时区
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);

        //方法3：static ZoneId of(String zoneId);           获取指定的时区
        ZoneId zoneId1=ZoneId.of("Asia/Aden");
        System.out.println(zoneId1);
    }
}
