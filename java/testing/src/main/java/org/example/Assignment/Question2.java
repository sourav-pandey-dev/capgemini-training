package org.example.Assignment;


import java.util.HashMap;

class duplicateException extends RuntimeException {
    public duplicateException(String message) {
        super(message);
    }
}

class UserCredentialsMap extends HashMap<String, String> {

    @Override
    public String put(String key, String value) {
        if (this.containsKey(key)) {
            throw new duplicateException("this username " + key + " already exists.");
        }

        return super.put(key, value);
    }



    public static void main(String[] args) {
        UserCredentialsMap userMap = new UserCredentialsMap();

        try {

            userMap.put("sourav", "000000");

            userMap.put("saurabh", "111111");

            userMap.put("sourav", "555555");

        } catch (duplicateException e) {
            System.err.println(e);
        }
    }
}
