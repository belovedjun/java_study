package com.s04.superex;

//�θ�Ŭ����
class Mother{
	public String getLunch() {
		return "��";
	}
}
//�ڽ�Ŭ����
class Son extends Mother{
	
}
class Daughter extends Mother{
	//�޼��� �������̵�(������)
	@Override
	public String getLunch() {
		return "��";
	}
	public String getRice() {
		//�θ�Ŭ���� ������ getLunch�޼��� ȣ��
		return super.getLunch();
	}
}

public class SuperMain01 {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println(
				"���� " + d.getLunch() + "�� �Խ��ϴ�.");
		System.out.println(
				"���� ������ ���� " + d.getRice() + "�� �԰� �;�����!!");
	}
}




