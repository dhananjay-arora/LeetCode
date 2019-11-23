class Solution {
    public String defangIPaddr(String address) {
        
        StringBuilder defangIpAddress = new StringBuilder();
	 
	 for(int i=0; i<address.length(); i++) {
		 
		 char current = address.charAt(i);
		 
		 
		 if(current == '.' ) {
			 defangIpAddress.append("[.]");
		 }else {
			 defangIpAddress.append(current);
		 }
	 }
	 return defangIpAddress.toString();

    }
}
