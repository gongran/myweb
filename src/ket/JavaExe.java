package ket;

/**
 * java中调用exe文件
 * 
 * @author gongr_000
 *
 */
public class JavaExe {
	public static void main(String[] args) {
//		openWinExe();
		openExe();
	}

	// 用 Java 调用windows系统的exe文件，比如notepad，calc之类
	public static void openWinExe() {
		Runtime rn = Runtime.getRuntime();
		Process p = null;
		try {
			String command = "mspaint";
			p = rn.exec(command);
		} catch (Exception e) {
			System.out.println("Error win exec!");
		}
	}

	// 调用其他的可执行文件，例如：自己制作的exe，或是 下载 安装的软件.
	public static void openExe() {
		Runtime rn = Runtime.getRuntime();
		Process p = null;
		try {
//			p = rn.exec("C:\\Program Files\\Internet Explorer\\IEXPLORE.EXE "+"www.baidu.com");//用IE打开网页
			p = rn.exec("C:\\Program Files\\腾讯游戏\\英雄联盟\\TCLS\\Client.exe");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error exec!");
		}
	}

}
