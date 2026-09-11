package question5;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeSubFolder(String folderName) {
        for (int i = 0; i < subFolders.size(); i++) {
            Folder folder = subFolders.get(i);

            if (folder.getName().equals(folderName)) {
                folder.deleteContents();
                subFolders.remove(i);
                return;
            }
        }
    }

    private void deleteContents() {
        for (Folder folder : subFolders) {
            folder.deleteContents();
        }

        files.clear();
        subFolders.clear();
    }

    public void print() {
        print("");
    }

    private void print(String indent) {
        System.out.println(indent + "[Folder] " + name);

        for (Folder folder : subFolders) {
            folder.print(indent + "    ");
        }

        for (File file : files) {
            System.out.println(
                    indent + "    [File] " + file.getName()
            );
        }
    }
}