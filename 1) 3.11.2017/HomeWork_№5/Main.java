import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		int[][] IP = new int[2][4];
        int Subnet[][] = new int[2][4];
        int[] Mask = new int[4];
		IPAddressAndMask Check = new IPAddressAndMask();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lead IP and Mask");
        String mask;
        System.out.print("Enter the first part of the first IP addresses: ");
        String ip = scan.next();
        Check.check(ip);
        IP[0][0] = Integer.parseInt(ip);
        System.out.print("Enter the second part of the first IP address: ");
        ip = scan.next();
        Check.check(ip);
        IP[0][1] = Integer.parseInt(ip);
        System.out.print("Enter the third part of the first IP address: ");
        ip = scan.next();
        Check.check(ip);
        IP[0][2] = Integer.parseInt(ip);
        System.out.print("Enter the fourth part of the first IP address: ");
        ip = scan.next();
        Check.check(ip);
        IP[0][3] = Integer.parseInt(ip);
        System.out.print("Enter the first part of the second IP address: ");
        ip = scan.next();
        Check.check(ip);
        IP[1][0] = Integer.parseInt(ip);
        System.out.print("Enter the second part of the second IP address: ");
        ip = scan.next();
        Check.check(ip);
        IP[1][1] = Integer.parseInt(ip);
        System.out.print("Enter the third part of the second IP address: ");
        ip = scan.next();
        Check.check(ip);
        IP[1][2] = Integer.parseInt(ip);
        System.out.print("Enter the fourth part of the second IP address: ");
        ip = scan.next();
        Check.check(ip);
        IP[1][3] = Integer.parseInt(ip);
        System.out.print("Enter the first part of the subnet mask: ");
        mask = scan.next();
        Check.check(mask);
        Mask[0] = Integer.parseInt(mask);
        System.out.print("Enter the second part of the subnet mask: ");
        mask = scan.next();
        Check.check(mask);
        Mask[1] = Integer.parseInt(mask);
        System.out.print("Enter the third part of the subnet mask: ");
        mask = scan.next();
        Check.check(mask);
        Mask[2] = Integer.parseInt(mask);
        System.out.print("Enter the fourth part of the subnet mask: ");
        mask = scan.next();
        Check.check(mask);
        Mask[3] = Integer.parseInt(mask);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Subnet[i][j] = IP[i][j] & Mask[j];
            }
        }
        for (int j = 0; j < 4; j++) {
            if (Subnet[0][j] != Subnet[1][j]) {
                System.out.println("Addresses do not belong to the same subnet");
                return;
            }
        }
        System.out.println("Addresses belong to the same subnet");
    }
}

class IPAddressAndMask {
    int length;

    public void check(String IpOrMask) {
        length = IpOrMask.length();
        if (length > 3) {
            System.out.println("ERROR");
            System.exit(0);
        }
        if (length == 1) {
            if (IpOrMask.charAt(0) < 48 || IpOrMask.charAt(0) > 57) {
                System.out.println("ERROR");
                System.exit(0);
            }
        }
        if (length == 2) {
            if ((IpOrMask.charAt(0) < 49) || (IpOrMask.charAt(0) > 57)){
                System.out.println("ERROR");
                System.exit(0);
            }
            if ((IpOrMask.charAt(0) >= 49 || IpOrMask.charAt(0) <= 57)) {
                if ((IpOrMask.charAt(1) < 48) || (IpOrMask.charAt(1) > 57)) {
                    System.out.println("ERROR");
                    System.exit(0);
                }
            }
        }
        if (length == 3) {
            if ((IpOrMask.charAt(0) < 49) || (IpOrMask.charAt(0) > 50)){
                System.out.println("ERROR");
                System.exit(0);
            }
            if ((IpOrMask.charAt(0) >= 49 || IpOrMask.charAt(0) <= 50)) {
                if ((IpOrMask.charAt(1) < 48) || (IpOrMask.charAt(1) > 53)) {
                    System.out.println("ERROR");
                    System.exit(0);
                }
            }
            if ((IpOrMask.charAt(0) >= 49 || IpOrMask.charAt(0) <= 50)) {
                if ((IpOrMask.charAt(1) >= 48) || (IpOrMask.charAt(1) <= 53)) {
                    if ((IpOrMask.charAt(2) < 48) || (IpOrMask.charAt(2) > 53)) {
                        System.out.println("ERROR");
                        System.exit(0);
                    }
                }

            }
        }
    }
}