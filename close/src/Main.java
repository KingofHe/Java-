import java.io.IOException;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
                // 定义关机命令，这里使用的是Windows的shutdown命令，并设置了1分钟后关机
                String shutdownCommand = "shutdown /s /t 7200";

                try {
                    // 执行关机命令
                    Runtime.getRuntime().exec(shutdownCommand);
                    System.out.println("计算机将在两小时后关机");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("执行关机命令时出错");
                }
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
