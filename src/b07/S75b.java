package b07;

public class S75b {
    public void f() {
        try {
            g();
        } catch (Exception ex) {
            System.out.println("Exception caught");
        } finally {
            cleanup();
        }
    }
    
    class PaperinoException extends Exception {
		private static final long serialVersionUID = 1L;

		public PaperinoException(String message) {
    		super(message);
    	}
    }
    
    int first (int[] values) throws PaperinoException {
    	if (values == null || values.length == 0) {
//    		throw new IllegalArgumentException("values should be not null nor empty");
    		throw new PaperinoException("values should be not null nor empty");
    	}
    	return values[0];
    }

    public void g() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        S75b exceptional = new S75b();
        exceptional.f();
        
        try {
			exceptional.first(null);
		} catch (PaperinoException e) {
			System.out.println("EXception: " + e.getMessage());
			e.printStackTrace();
		}
    }
}
