class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        words = text.split()
        count = 0

        for word in words:
            valid = True
            for ch in word:
                if ch in brokenLetters:
                    valid = False
                    break
            
            if valid:
                count += 1

        return count
