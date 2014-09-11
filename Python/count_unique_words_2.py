# Count unique words in a list using Counter

from collections import Counter

def countOccurence(words):
  return Counter(words)

words = ['im', 'jolo', 'balbin', 'im']

occ = countOccurence(words)

print occ
# Output: Counter({'im': 2, 'balbin': 1, 'jolo': 1})

print occ['im']
# Output: 2