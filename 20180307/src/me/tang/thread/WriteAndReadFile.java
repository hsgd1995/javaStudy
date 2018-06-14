package me.tang.thread;

/**
 * 实现异步写文件 
 * 1) 线程1-ReadThread负责将控制台信息读取到内存缓冲区（集合），如果控制台输入quit将结束输入，中断退出线程
 * 2)线程2-WriteThread负责将缓冲区中的信息写到硬盘文件，每次检查缓冲区是否有数据，如果有就写出，直到空为止，如果没有数据就休眠5秒，
 * 写出线程是后台线程, 可以自动结束 
 * 3) 缓冲区采用队列(FIFO)的工作方式
 *
 * @author Administrator
 *
 */
public class WriteAndReadFile {

	public static void main(String[] args) {
		Thread readThread = new Thread();
		
		Thread WreteTherad = new Thread();
	}

}
