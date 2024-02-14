package com.chiarapuleio.exdaythree.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super("Item not found");
    }

    public NotFoundException(UUID id){
        super("Id " + id + " already exist." );
    }
}
