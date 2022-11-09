package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    UserValidation user = new UserValidation();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateFirstName("Manoj");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateFirstName("manoj");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateLastName("Kumar");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateLastName("kumar");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateEmailId("abc.xyz@bl.co.on");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateEmailId("abc@xyz@bl.co.on");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateMobileNumber("91 9999999999");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateMobileNumber("9999999999");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        boolean result = user.validatePassword("Manoj@K22");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validatePassword("mzncjh");
        Assert.assertFalse(result);
    }
}
