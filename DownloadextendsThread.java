10class Download extends Thread {
    String fileName;

    Download(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(fileName + " downloading... " + (i * 20) + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(fileName + " download complete");
    }

    public static void main(String[] args) {
        new Download("File A").start();
        new Download("File B").start();
        new Download("File C").start();
    }
}