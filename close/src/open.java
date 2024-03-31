import java.io.IOException;

public class open {
    public static void main(String[] args) {
            // 定义取消关机的命令
        String cancelShutdownCommand = "shutdown /a";

        try {
                // 执行取消关机命令
            Process process = Runtime.getRuntime().exec(cancelShutdownCommand);
            int exitCode = process.waitFor(); // 等待命令执行完成并获取退出码
            if (exitCode == 0) {
                System.out.println("已取消自动关机");
            } else {
                System.out.println("取消自动关机失败");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("执行取消关机命令时出错");
        }
    }
}
