class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // Re-throwing the exception
        }
    }

    public static void main(String args[]) {
        try {
			demoproc();
		} catch (Exception e) {
			System.out.println("Recaught: "+e);
		}
    }
}