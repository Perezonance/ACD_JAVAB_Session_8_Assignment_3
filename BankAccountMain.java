package assignment_3;

public class BankAccountMain {
	public static void main(String[] args) {
		
		BankAccount accUnsync = new BankAccount(10000);
		BankAccount accSync = new BankAccount(20000);
		
		DepositThread dTh1 = new DepositThread(accSync, 500);
		WithdrawThread wTh1 = new WithdrawThread(accSync, 1000);
		
		
		Thread thSyncD = new Thread(dTh1);
		Thread thSyncW = new Thread(wTh1);
		Thread thUnsyncD = new Thread(dTh1);
		Thread thUnsyncW = new Thread(wTh1);
		thSyncD.start();
		synchronized (thSyncD) {
			try {
				thSyncD.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		thSyncW.start();
		synchronized (thSyncW) {
			try {
				thSyncW.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Unsynced Transactions:");
		thUnsyncD.start();

	}
}
