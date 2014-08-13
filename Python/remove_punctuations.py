# remove punctuations from string

def removePunctuations(text):
  return ''.join(t for t in text if t.isalnum() or t == ' ')