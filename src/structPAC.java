import java.math.BigInteger;
import java.util.Arrays;

public class structPAC {
    // ZZSA00000001000000
    // BGUS91601405076800
    // BUIN77501026258025

    protected static int _bufferLen = 150;
    protected static byte[] _buffer = new byte[_bufferLen];

    private static int[] AccountID = {0, 18};
    private static int[] AvailState = {18, 19};
    private static int[] AvailAmt = {19, 32};
    private static int[] TotAuthPend = {32, 45};
    private static int[] TotDcAleu = {45, 58};
    private static int[] TotDcSteu = {58, 71};
    private static int[] AvailDate = {71, 77};
    private static int[] CachLimitInd = {77, 78};
    private static int[] CachLimit = {78, 90};
    private static int[] CachLimitBank = {90, 102};
    private static int[] CachLimitDate = {102, 108};
    private static int[] CurcyCode = {108, 111};
    private static int[] Filler = {111, 150};

    structPAC(byte[] bytes) {
        _buffer = bytes;
    }

    /**
     Returns the expected length of the byte array used by this class.
     @return int expected length of byte array.
     */
    public int getLength() {
        return _bufferLen;
    }

    public String getAccountID() {
        return new String(Arrays.copyOfRange(_buffer, AccountID[0], AccountID[1]));
    }

    public void setAccountID(String str) {
        setString(str, AccountID);
    }

    public String getAvailState() {
        return new String(Arrays.copyOfRange(_buffer, AvailState[0], AvailState[1]));
    }

    public void setAvailState(String str) {
        setString(str, AvailState);
    }

    public int getAvailAmt() {
        return getInt(AvailAmt);
    }

    public void setAvailAmt(int value) {
        setInt(value, AvailAmt);
    }

    public int getTotAuthPend() {
        return getInt(TotAuthPend);
    }

    public void setTotAuthPend(int value) {
        setInt(value, TotAuthPend);
    }

    public int getTotDcAleu() {
        return getInt(TotDcAleu);
    }

    public void setTotDcAleu(int value) {
        setInt(value, TotDcAleu);
    }

    public int getTotDcSteu() {
        return getInt(TotDcSteu);
    }

    public void setTotDcSteu(int value) {
        setInt(value, TotDcSteu);
    }

    public int getAvailDate() {
        return getInt(AvailDate);
    }

    public void setAvailDate(int value) {
        setInt(value, AvailDate);
    }

    public String getCachLimitInd() {
        return new String(Arrays.copyOfRange(_buffer, CachLimitInd[0], CachLimitInd[1]));
    }

    public void setCachLimitInd(String str) {
        setString(str, CachLimitInd);
    }

    public int getCachLimit() {
        return getInt(CachLimit);
    }

    public void setCachLimit(int value) {
        setInt(value, CachLimit);
    }

    public int getCachLimitBank() {
        return getInt(CachLimitBank);
    }

    public void setCachLimitBank(int value) {
        setInt(value, CachLimitBank);
    }

    public int getCachLimitDate() {
        return getInt(CachLimitDate);
    }

    public void setCachLimitDate(int value) {
        setInt(value, CachLimitDate);
    }

    public int getCurcyCode() {
        return getInt(CurcyCode);
    }

    public void setCurcyCode(int value) {
        setInt(value, CurcyCode);
    }

    /**
     * Auxiliary method for Right padding.
     */
    private static String paddingRight(String inputString, int padLength, String character) {
        if (inputString.length() >= padLength) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder(inputString);
        while (sb.length() < padLength) {
            sb.append(character);
        }

        return sb.toString();
    }

    private static String checkForNullOrEmpty(String str) {
        if ((str != null) && (!str.isEmpty()))
            return str;
        return "";
    }

    private static void setString(String str, int[] arr) {
        str = checkForNullOrEmpty(str);
        if(str.length() < arr[1])
            str = paddingRight(str, arr[1], " ");

        byte[] bytes = str.substring(arr[0], arr[1]).getBytes();
        System.arraycopy(bytes, 0, _buffer, arr[0], arr[1]);
    }

    private static int getInt(int[] arr) {
        int value = 0;
//        for (int i = arr[0]; i < arr[1]; i++ ) {
//            value = (value << 8) + (_buffer[i] & 0xFF);
//        }
        value = Integer.parseInt(new String(Arrays.copyOfRange(_buffer, arr[0], arr[1])));
        return value;
    }

    private static void setInt(int val, int[] arr) {
        byte[] bytes = new byte[arr[1]-arr[0]];
        System.out.println("bytes.length: " + bytes.length);
        bytes = BigInteger.valueOf(val).toByteArray();
        System.out.println("bytes.length: " + bytes.length);
        System.arraycopy(bytes, 0, _buffer, arr[0], bytes.length);
    }
}
