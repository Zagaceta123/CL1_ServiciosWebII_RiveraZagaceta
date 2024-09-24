package com.cibertec.ExamenServiciosWeb.Asincrono;

import java.io.IOException;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.cibertec.ExamenServiciosWeb.Services.ArchivoService;

@Service
public class AsyncService {

    private final ArchivoService archivoService;

    public AsyncService(ArchivoService fileService) {
        this.archivoService = fileService;
    }

    @Async
    public void executeAsyncTasks() throws InterruptedException, IOException {
    	archivoService.createFileWithDelay1();
        archivoService.createFileWithDelay2();
        archivoService.createFileWithDelay3();
    }
}
