class Solution {
    public String reformatNumber(String number) {
        String digits = number.replaceAll("[ -]", "");
        StringBuilder ans = new StringBuilder();

        int i = 0;
        while (digits.length() - i > 4) {
            ans.append(digits.substring(i, i + 3)).append("-");
            i += 3;
        }

        int rem = digits.length() - i;

        if (rem == 4) {
            ans.append(digits.substring(i, i + 2))
               .append("-")
               .append(digits.substring(i + 2));
        } else {
            ans.append(digits.substring(i));
        }

        return ans.toString();
    }
}