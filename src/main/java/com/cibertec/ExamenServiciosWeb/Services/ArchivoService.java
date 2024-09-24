package com.cibertec.ExamenServiciosWeb.Services;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class ArchivoService {


    // Función con demora de 10 segundos
    public void createFileWithDelay1() throws InterruptedException, IOException {
        Thread.sleep(10000); // 10 segundos de espera
        createFile("file1.txt", "Contenido del archivo 1");
    }

    // Función con demora de 5 segundos
    public void createFileWithDelay2() throws InterruptedException, IOException {
        Thread.sleep(5000); // 5 segundos de espera
        createFile("file2.txt", "Contenido del archivo 2");
    }

    // Función con demora de 7 segundos
    public void createFileWithDelay3() throws InterruptedException, IOException {
        Thread.sleep(7000); // 7 segundos de espera
        createFile("file3.txt", "Contenido del archivo 3");
    }

    // Método auxiliar para escribir en un archivo
    private void createFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}
