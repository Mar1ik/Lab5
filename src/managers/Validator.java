package managers;

import data.OrganizationType;
import data.randomizer.IdRandomizer;
import exceptions.*;

public class Validator {
    public static void idIsOK(String arg) throws IdCopyEX, WrongArgEX {
        long id;
        try {
            id = Long.parseLong(arg);
        } catch (Exception e) {
            throw new WrongArgEX("ID");
        }
        if (!IdRandomizer.IDisUnic(id)) {
            throw new IdCopyEX(id);
        }
    }

    public static void InputIsNotEmpty(String arg, String data) throws WrongArgEX {
        if (arg.isEmpty()) {
            throw new WrongArgEX(data);
        }
    }

    public static void CoordinatesIsValid(String arg) throws WrongArgEX {
        try {
            Integer.parseInt(arg);
        } catch (Exception e) {
            throw new WrongArgEX("Coordinates");
        }
    }

    public static void salaryIsValid(String arg) throws WrongArgEX {
        try {
            int z = Integer.parseInt(arg);
            if (0 > z) {
                throw new MoneyMakerEX("Chet v minus rabotaesh");
            }
        } catch (Exception e) {
            throw new WrongArgEX("salary");
        }
    }

    public static void OrganizationTypeIsValid(String arg) throws WrongArgEX {
        try {
            OrganizationType.valueOf(arg);
        } catch (Exception e) {
            throw new WrongArgEX("OrganyzationType");
        }
    }

    public static void StatusIsValid(String arg) throws WrongArgEX {
        try {
            OrganizationType.valueOf(arg);
        } catch (Exception e) {
            throw new WrongArgEX("OrganyzationType");
        }
    }

    public static void NameIsValid(String arg) {

    }


}
