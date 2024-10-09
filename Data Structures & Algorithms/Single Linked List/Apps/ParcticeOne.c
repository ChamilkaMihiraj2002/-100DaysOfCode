#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node * link;
};

struct node * head;

void display();
void insertBegin();
void insertEnd();
void countNode();

int InputInt();

int main() {
    head = (struct node *) malloc (sizeof(struct node));
    head->data = 5;
    head->link = NULL;

    for (int i = 0; i < 5; i++)
    {
        insertEnd();
    }

    display();
    countNode();

    insertBegin();
    display();
    countNode();
    
    return 0;
}

void display() {
    struct node * ptr = head;
    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    printf("\n");
}

void insertBegin() {
    struct node * temp = (struct node * ) malloc (sizeof(struct node));
    
    temp->data = InputInt();
    temp->link = NULL;

    temp->link = head;
    head = temp;    
}

void insertEnd() {
    struct node * temp = (struct node * ) malloc (sizeof(struct node));
    
    temp->data = InputInt();
    temp->link = NULL;

    if (head == NULL)
    {
        head = temp;
    } else {
        struct node * ptr = head;
        while (ptr->link != NULL) {
            ptr = ptr->link;
        }
        ptr->link = temp;
    }
    

}

void countNode() {
    struct node * ptr = head;
    int count = 0;
    while (ptr != NULL)
    {
        ptr = ptr->link;
        count++;
    }
    printf("Node Count is :: %d\n", count);
}

int InputInt() {
    int value;
    printf("Enter number :: ");
    scanf("%d", &value);
    return value;
}