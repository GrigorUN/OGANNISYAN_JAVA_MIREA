package Practika13;
public class Phone {
    StringBuffer PhoneNumber;

    public Phone(String pnoneNumber) {
        PhoneNumber = new StringBuffer();
        char[] PNL = pnoneNumber.toCharArray();
        if (PNL[0] == '+') {
            PhoneNumber.append('+').append(PNL[1]).append(PNL[2]).append(PNL[3]).append(PNL[4]).append('-').append(PNL[5])
                    .append(PNL[6]).append(PNL[7]).append('-').append(PNL[8]).append(PNL[9]).append(PNL[10]).append(PNL[11]);
        }
        else {
            PhoneNumber.append('+').append(Integer.parseInt(String.valueOf(PNL[0])) - 1).append(PNL[1]).append(PNL[2]).append(PNL[3]).append('-').append(PNL[4])
                    .append(PNL[5]).append(PNL[6]).append('-').append(PNL[7]).append(PNL[8]).append(PNL[9]).append(PNL[10]);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "PnoneNumber=" + PhoneNumber +
                '}';
    }

    public StringBuffer getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(StringBuffer phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
