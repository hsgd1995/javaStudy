package com.entor.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserSerializeTest2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		User user = new User();
		System.out.println(user);

		// �����л�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("����.txt"));
		user.readObject(ois);
		System.out.println(user);
	}
}
