package ����ó��v01;

import java.io.IOException;

import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import view.CSugangsincungView;
import DAOs.DAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import control.CSugangsincungControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;
import entity.CSugangsincung;


public class CMain {

	public static void main(String[] args) throws IOException {
		// Login
		// 
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		DAO memberDAO = new DAO();
		memberDAO.write(member, "member");
		member = (CMember) memberDAO.read("member");
		
		// ���񰳼�
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = gwamokView.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		DAO gwamokDAO = new DAO() ; 
		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		
		// ���°���
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		DAO gangjwaDAO = new DAO() ; 
		gangjwaDAO.write(gangjwa,"gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		
		// ������û
		
		CSugangsincungView sugangsincungView = new CSugangsincungView();
		CSugangsincung sugangsincung = sugangsincungView.getsugangsincung();
		CSugangsincungControl sugangsincungControl = new CSugangsincungControl();
		sugangsincung = sugangsincungControl.processSugangsincung(sugangsincung);
		DAO sugangsincungDAO = new DAO() ; 
		sugangsincungDAO.write(sugangsincung,"sugangsincung");
		sugangsincung = (CSugangsincung) sugangsincungDAO.read("sugangsincung");

	}
}
		

		
