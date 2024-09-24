package com.cibertec.ExamenServiciosWeb.Controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.ExamenServiciosWeb.Asincrono.AsyncService;

@RestController
public class ArchivoController {

	 private final AsyncService asyncService;

	    public ArchivoController(AsyncService asyncService) {
	        this.asyncService = asyncService;
	    }

	    @GetMapping("/start-tasks")
	    public String startAsyncTasks() throws InterruptedException, IOException {
	        asyncService.executeAsyncTasks();
	        return "Las tareas se están ejecutando de forma asíncrona.";
	    }
}
