package iw.concurrent.atomiccounter;

public class XKDaemon {
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonRunner(), "xkDaemonRunner");
		thread.setDaemon(true);
		thread.start();
	}

	static class DaemonRunner implements Runnable  {
		@Override
		public void run() {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
				System.out.println("Java⼩小咖秀 daemonThread finally run …");
			}
		}
	}
}
