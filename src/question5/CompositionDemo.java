package question5;

public class CompositionDemo {
    public static void main(String[] args) {

        // Root folder
        Folder phpDemo1 = new Folder("php_demo1");

        // Main subfolders
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);


        // Subfolders inside Source Files
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);


        // Subfolders inside app
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));


        // Files inside public
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File(".htrouter.php"));
        publicFolder.addFile(new File("index.html"));


        // 1. Print original structure
        System.out.println("===== ORIGINAL STRUCTURE =====");
        phpDemo1.print();


        // 2. Delete app and print again
        sourceFiles.removeSubFolder("app");

        System.out.println();
        System.out.println("===== AFTER DELETING app =====");
        phpDemo1.print();


        // 3. Delete public and print again
        sourceFiles.removeSubFolder("public");

        System.out.println();
        System.out.println("===== AFTER DELETING public =====");
        phpDemo1.print();
    }
}