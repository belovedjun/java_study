package com.s02.extention;

public class PhoneMain {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(
				"010-1234-5678","A123","White","�ȵ���̵�");//�����ڸ� ���ؼ� ����
		FeaturePhone fp = new FeaturePhone(
				"010-5678-1234","Z123","Black",500);
		
		System.out.println("--------------------------");
		System.out.println("��ȣ\t��\t����\t�ɼ�(OS/ȭ�Ҽ�)");
		System.out.println("--------------------------");
		
		System.out.print(sp.getNumber() + "\t");
		System.out.print(sp.getModel() + "\t");
		System.out.println(sp.getColor() + "\t");
		System.out.println(sp.getOs() + "\n");
		
		System.out.print(fp.getNumber() + "\t");
		System.out.print(fp.getModel() + "\t");
		System.out.print(fp.getColor() + "\t");
		System.out.print(fp.getPixel() + "\n");
	}
}
