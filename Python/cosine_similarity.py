import re, math
from collections import Counter

class CosineSimilarity:
  def getCosine(self, vec1, vec2):
    intersection = set(vec1.keys()) & set(vec2.keys())
    numerator = sum([vec1[x] * vec2[x] for x in intersection])

    sum1 = sum([vec1[x] ** 2 for x in vec1.keys()])
    sum2 = sum([vec2[x] ** 2 for x in vec2.keys()])
    denominator = math.sqrt(sum1) * math.sqrt(sum2)

    if not denominator:
      return 0.0
    else:
      return float(numerator) / denominator

  def textToVector(self, text):
    wordRegex = re.compile(r'\w+')

    words = wordRegex.findall(text)

    return Counter(words)

# vector1 = text_to_vector(text1)
# vector2 = text_to_vector(text2)

# cosine = get_cosine(vector1, vector2)

# print 'Cosine:', cosine
# Source: http://stackoverflow.com/questions/15173225/how-to-calculate-cosine-similarity-given-2-sentence-strings-python