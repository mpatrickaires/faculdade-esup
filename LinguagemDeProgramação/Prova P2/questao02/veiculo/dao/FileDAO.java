package questao02.veiculo.dao;

import questao02.veiculo.Veiculo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class FileDAO {
    protected String fileName;
    private String directory;

    public FileDAO(String fileName) {
        this.fileName = fileName;
        this.directory = System.getProperty("user.dir");
    }

    public String getAbsolutyFileDirectory() {
        return this.directory + "/src/questao02/dados/" + this.fileName;
    }

    public List<String> openFileToRead() {
        try {

            String inputFileName = this.getAbsolutyFileDirectory();

            FileReader file = new FileReader(inputFileName);

            BufferedReader buffer = new BufferedReader(file);

            List<String> linhas = new ArrayList<String>();
            String linha = buffer.readLine();
            while(linha != null) {
                linhas.add(linha);
                linha = buffer.readLine();
            }
            buffer.close();
            return linhas;

        } catch(IOException ioException) {
            System.out.println(ioException.getMessage());
            return new ArrayList<String>();
        }
    }

    public abstract List<Veiculo> read();
    public abstract Veiculo convertLineToEntity(String linha);

    public void write(Veiculo veiculo) {
        try {

            String inputFileName = this.getAbsolutyFileDirectory();

            FileWriter file = new FileWriter(inputFileName, true);

            BufferedWriter buffer = new BufferedWriter(file);

            buffer.newLine();

            buffer.write(veiculo.toString());

            buffer.close();

        } catch(IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
