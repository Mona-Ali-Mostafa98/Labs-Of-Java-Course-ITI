class splitIPAdress {
    public static void main(String[] args) {
        String ipAddress = "192.4555.1.1";

        if (isValidIPAddress(ipAddress)) {
            System.out.println("The IP address is valid.");
            String[] parts = ipAddress.split("\\.");
            System.out.println("IP Address Parts:");
            for (String part : parts) {
                System.out.println(part);
            }

        } else {
            System.out.println("The IP address is not valid.");
        }

    }

    private static boolean isValidIPAddress(String ipAddress) {
        String parts[] = ipAddress.split("\\.");

        if (parts.length != 4) {
            return false;
        }

        // Check each part for a valid integer value in the range [0, 255]
        for (int i = 0; i < parts.length; i++) {
            try {
                int value = Integer.parseInt(parts[i]);
                if (value < 0 || value > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false; // If parsing as an integer fails, the part is not a valid number
            }
        }

        // If all checks pass, the IP address is considered valid
        return true;
    }
}
