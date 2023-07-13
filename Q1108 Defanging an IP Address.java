class Solution {
    public String defangIPaddr(String address) {
        String newip = address.replace(".", "[.]");
        System.gc();
        return newip;
    }
}
