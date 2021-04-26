package iw.concurrent.atomiccounter;

public class ThreadLocalExt extends ThreadLocal {
	static ThreadLocalExt threadLocalExt = new ThreadLocalExt();

	@Override
	protected Object initialValue() {
		return "Java⼩小咖秀";
	}

	public static void main(String[] args) {
		System.out.println(threadLocalExt.get());
	}
}
