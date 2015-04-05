package ����ó��v01;

import java.io.IOException;

import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import view.CSugangsincungView;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import DAOs.TextDAO;
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
		
		// �α���
		CLoginView loginView = new CLoginView();
		CMember member = (CMember) loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		IDAO memberDAO = new TextDAO();
		memberDAO.write(member, "member");
		member = (CMember) memberDAO.read("member");
		
		// ���񰳼�
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = (CGwamok) gwamokView.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		IDAO gwamokDAO = new TextDAO() ; 
		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		
		// ���°���
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = (CGangjwa) gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		IDAO gangjwaDAO = new TextDAO() ; 
		gangjwaDAO.write(gangjwa,"gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		
		// ������û
		
		CSugangsincungView sugangsincungView = new CSugangsincungView();
		CSugangsincung sugangsincung = sugangsincungView.getsugangsincung();
		CSugangsincungControl sugangsincungControl = new CSugangsincungControl();
		sugangsincung = sugangsincungControl.processSugangsincung(sugangsincung);
		IDAO sugangsincungDAO = new ObjectDAO() ; 
		sugangsincungDAO.write(sugangsincung,"sugangsincung");
		sugangsincung = (CSugangsincung) sugangsincungDAO.read("sugangsincung");

	}
}
		

		
