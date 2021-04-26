package iw.concurrent.atomiccounter;

public class XKThreadLocal {
	public static ThreadLocal threadLocal = new ThreadLocal();

	public static void main(String[] args) {
		if (threadLocal.get() == null) {
			System.out.println("未设置过值");
			threadLocal.set("Java⼩小咖秀");
		}
		System.out.println(threadLocal.get());
	}
}
