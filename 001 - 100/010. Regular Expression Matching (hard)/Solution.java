package leetcode;

// String s don't use '*' or '.'?
// slow(time complexity)
public class Solution {
	public static void main(String[] args) {
	}

	public boolean isMatch(String s, String p) {
		if(p.isEmpty()){
			return s.isEmpty();
		}else if(p.length()==1){
			if(s.length()==1 && (p.charAt(0)=='.' || p.charAt(0) == s.charAt(0))){
				return true;
			}else{
				return false;
			}
		}else if(p.charAt(1)!='*'){
			if(!s.isEmpty() && (p.charAt(0)=='.' || p.charAt(0)==s.charAt(0))){
				return isMatch(s.substring(1), p.substring(1));
			}else{
				return false;
			}
		}
		
		while(!s.isEmpty() && (p.charAt(0)=='.' || p.charAt(0) == s.charAt(0))){
			if(isMatch(s, p.substring(2))){
				return true;
			}
			s = s.substring(1);
		}
		
		return isMatch(s, p.substring(2));
	}
}