# Count unique words in a list

def countUniqueWords(words):
  wordList = []

  for word in words:
    # Get all the word in the dictionary list
    wl = [w['word'] for w in wordList]

    if word not in wl:
      wordList.append({'word': word, 'count': 1})
    else:
      # get the current word in the dictionary list
      wordMap = [w for w in wordList if w['word'] == word][0]
      wordMap['count'] += 1

  return wordList